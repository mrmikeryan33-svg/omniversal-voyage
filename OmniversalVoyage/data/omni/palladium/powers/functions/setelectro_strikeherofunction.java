public class SetEnvyHeroFunction implements IFunction {
    @Override
    public void execute(FunctionContext ctx) {
        ServerPlayer player = ctx.getPlayer();
        if (player == null) return;

        player.getCapability(HeroCapability.INSTANCE)
              .ifPresent(cap -> cap.setHero(ModHeroes.ENVY.get()));
    }
}
