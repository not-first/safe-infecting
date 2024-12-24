package faker.safeinfecting.mixin;

import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.Difficulty;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ZombieEntity.class)
public class SafeInfectingMixin {
	@Redirect(
			method = "onKilledOther",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/server/world/ServerWorld;getDifficulty()Lnet/minecraft/world/Difficulty;"
			)
	)
	// hard mode has a 100% chance of conversion, so replace the difficulty check with a constant return of hard
	private Difficulty alwaysReturnHard(ServerWorld instance) {
		return Difficulty.HARD;
	}
}