package faker.safeinfecting;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SafeInfecting implements ModInitializer {
	public static final String MOD_ID = "safe-infecting";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Safe Infecting initialized.");
	}
}