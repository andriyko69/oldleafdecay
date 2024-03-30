package ua.softwind.oldleafdecay.mixin;


import net.minecraft.block.LeavesBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LeavesBlock.class)
public class LeafDecayRangeMixin {
    @ModifyConstant(method = {"shouldDecay", "hasRandomTicks", "<init>"}, constant = @Constant(intValue = 7))
    private int modifyMaxLeafDecayDistance(int value) {
        return 5;
    }

    @ModifyConstant(method = {"getDistanceFromLog", "updateDistanceFromLogs"}, constant = @Constant(intValue = 7))
    private static int modifyStaticMaxLeafDecayDistance(int value) {
        return 5;
    }
}
