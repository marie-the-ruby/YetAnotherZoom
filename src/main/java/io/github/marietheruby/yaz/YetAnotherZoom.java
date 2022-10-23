package io.github.marietheruby.yaz;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YetAnotherZoom implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("YetAnotherZoom");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("The elites don't want you to know this but the zoom mods are free. I already have 50 zoom mods.");
	}
}
