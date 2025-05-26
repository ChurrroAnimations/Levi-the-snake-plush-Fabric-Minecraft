package github.churrroanimations.levisnekkyplush;

import github.churrroanimations.levisnekkyplush.thisisacreativenameforapackagethatisbasicallyjusttheregistry.thisisacreativenameforthejavafileforitemsinthelevisnekkyplushmod;
import github.churrroanimations.levisnekkyplush.thisisacreativenameforapackagethatisbasicallyjusttheregistry.mildlyunhingednameforthearmorthingythatjustmakesleviwearable;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeviSnekkyPlush implements ModInitializer {
	public static final String snekMod = "levisnekkyplush";
	public static final Logger loggerheadSeaTurtel = LoggerFactory.getLogger(snekMod);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		// No.

		//loggerheadSeaTurtel.info("Hello Fabric world!");
		thisisacreativenameforthejavafileforitemsinthelevisnekkyplushmod.prettyPrettyPleeeeeeeeeeeeeeeeeeeeaaaaaaaseLoadMyItemsColonThree();
		mildlyunhingednameforthearmorthingythatjustmakesleviwearable.forYourSakeIHopeYouLoadMyStuffForTheArmorOrIMightHaveToDoSomethingDrastic();
	}

	public static Identifier identiDeepFryerMyBelovedILikeEverythingDeepFriedMyMemesMyWomenYouNameItAndNoThereIsNotAModicumOfSeriousnessToBeFoundHere (String countryRooooooooooooaaaaaaadsTakeMeHooooooooooooooooooooooooooooome) {
		return Identifier.of(snekMod, countryRooooooooooooaaaaaaadsTakeMeHooooooooooooooooooooooooooooome);
	}
}