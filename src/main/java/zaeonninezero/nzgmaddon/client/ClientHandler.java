package zaeonninezero.nzgmaddon.client;

import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
import com.mrcrayfish.guns.client.render.gun.model.SimpleModel;
import zaeonninezero.nzgmaddon.nzgmAddon;
import zaeonninezero.nzgmaddon.init.initItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = nzgmAddon.MOD_ID, value = Dist.CLIENT)
public class ClientHandler
{
    public static void setup()
    {
        registerModelOverrides();
    }
	
	private static void registerModelOverrides()
    {
        ModelOverrides.register(initItems.REVOLVER.get(), new SimpleModel(SpecialModels.REVOLVER::getModel));
		ModelOverrides.register(initItems.UZI.get(), new SimpleModel(SpecialModels.UZI::getModel));
		ModelOverrides.register(initItems.SUBMACHINE_GUN.get(), new SimpleModel(SpecialModels.SUBMACHINE_GUN::getModel));
		ModelOverrides.register(initItems.RAPID_SMG.get(), new SimpleModel(SpecialModels.RAPID_SMG::getModel));
		ModelOverrides.register(initItems.PUMP_SHOTGUN.get(), new SimpleModel(SpecialModels.PUMP_SHOTGUN::getModel));
		ModelOverrides.register(initItems.HUNTING_SHOTGUN.get(), new SimpleModel(SpecialModels.HUNTING_SHOTGUN::getModel));
		ModelOverrides.register(initItems.DOUBLE_BARRELED_SHOTGUN.get(), new SimpleModel(SpecialModels.DOUBLE_BARRELED_SHOTGUN::getModel));
		ModelOverrides.register(initItems.AUTOMATIC_SHOTGUN.get(), new SimpleModel(SpecialModels.AUTOMATIC_SHOTGUN::getModel));
		ModelOverrides.register(initItems.HEAVY_ASSAULT_RIFLE.get(), new SimpleModel(SpecialModels.HEAVY_ASSAULT_RIFLE::getModel));
		ModelOverrides.register(initItems.BATTLE_RIFLE.get(), new SimpleModel(SpecialModels.BATTLE_RIFLE::getModel));
		ModelOverrides.register(initItems.MACHINE_GUN.get(), new SimpleModel(SpecialModels.MACHINE_GUN::getModel));
		ModelOverrides.register(initItems.HUNTING_RIFLE.get(), new SimpleModel(SpecialModels.HUNTING_RIFLE::getModel));
		ModelOverrides.register(initItems.SNIPER_RIFLE.get(), new SimpleModel(SpecialModels.SNIPER_RIFLE::getModel));
    }
}