package net.invictusslayer.dtslayersbeasts.mixin;

//@SuppressWarnings("AddedMixinMembersNamePattern")
public abstract class HugeMushroomGenFeatureMixin {
//	@Unique
//	private RandomSource random;
//	@Unique
//	private int direction;
//
//	@Shadow
//	protected abstract BlockState getMushroomStateForValue(Block mushroomBlock, BlockState stemBlock, int value, int y);
//
//	@Inject(method = "getCapForHeight", at = @At("HEAD"), cancellable = true)
//	private void onGetCapForHeight(Block mushroomBlock, int height, CallbackInfoReturnable<SimpleVoxmap> cir) {
//		if (mushroomBlock == SBBlocks.BLACK_MUSHROOM_BLOCK.get()) cir.setReturnValue(DTSBHugeMushroomGenFeature.BLACK_CAP);
//		if (mushroomBlock == SBBlocks.WHITE_MUSHROOM_BLOCK.get()) cir.setReturnValue(DTSBHugeMushroomGenFeature.WHITE_CAP);
//	}
//
//	@Inject(method = "generate", at = @At("HEAD"))
//	private void onGenerate(GenFeatureConfiguration configuration, FullGenerationContext context, CallbackInfoReturnable<Boolean> cir) {
//		random = context.random();
//		direction = random.nextInt(4);
//	}
//
//	@Inject(method = "getMushroomStateForValue", at = @At("HEAD"), cancellable = true)
//	private void onGetMushroomStateForValue(Block mushroomBlock, BlockState stemBlock, int value, int y, CallbackInfoReturnable<BlockState> cir) {
//		if (value > 25) {
//			if (value - 26 == direction) cir.setReturnValue(mushroomBlock.defaultBlockState());
//			else cir.setReturnValue(Blocks.AIR.defaultBlockState());
//		} else if (value > 19) {
//			cir.setReturnValue(mushroomBlock.defaultBlockState()
//					.setValue(UP, true)
//					.setValue(DOWN, value == 25)
//					.setValue(NORTH, value != 23)
//					.setValue(SOUTH, value != 20)
//					.setValue(WEST, value != 22)
//					.setValue(EAST, value != 21));
//		} else if (value > 10) {
//			if (random.nextInt(4) == 0) cir.setReturnValue(getMushroomStateForValue(mushroomBlock, stemBlock, value - 10, y));
//			else cir.setReturnValue(Blocks.AIR.defaultBlockState());
//		}
//	}
}
