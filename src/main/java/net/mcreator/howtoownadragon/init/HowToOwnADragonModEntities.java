
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.howtoownadragon.init;

import org.checkerframework.checker.units.qual.A;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.howtoownadragon.entity.YakEntity;
import net.mcreator.howtoownadragon.entity.TestNadderEntity;
import net.mcreator.howtoownadragon.entity.TestGronckleEntity;
import net.mcreator.howtoownadragon.entity.TTTestEntity;
import net.mcreator.howtoownadragon.entity.TTMaleEntity;
import net.mcreator.howtoownadragon.entity.TTFemaleEntity;
import net.mcreator.howtoownadragon.entity.TTEggEntityEntity;
import net.mcreator.howtoownadragon.entity.SheepEntity;
import net.mcreator.howtoownadragon.entity.NightFuryEntity;
import net.mcreator.howtoownadragon.entity.NadderMaleEntity;
import net.mcreator.howtoownadragon.entity.NadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.NadderEggEntityEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.JuvenileGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.GronckleEggEntityEntity;
import net.mcreator.howtoownadragon.entity.GronckleAttackProjectileEntity;
import net.mcreator.howtoownadragon.entity.ChickenEntity;
import net.mcreator.howtoownadragon.entity.BabyYakEntity;
import net.mcreator.howtoownadragon.entity.BabyTTMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabySheepEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.BabyGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.BabyChickenEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentTTFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentNadderFemaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleMaleEntity;
import net.mcreator.howtoownadragon.entity.AdolescentGronckleFemaleEntity;
import net.mcreator.howtoownadragon.entity.AEntity;
import net.mcreator.howtoownadragon.HowToOwnADragonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HowToOwnADragonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HowToOwnADragonMod.MODID);
	public static final RegistryObject<EntityType<NightFuryEntity>> NIGHT_FURY = register("night_fury", EntityType.Builder.<NightFuryEntity>of(NightFuryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(NightFuryEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GronckleMaleEntity>> GRONCKLE_MALE = register("gronckle_male", EntityType.Builder.<GronckleMaleEntity>of(GronckleMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleMaleEntity::new).fireImmune().sized(2f, 2f));
	public static final RegistryObject<EntityType<GronckleFemaleEntity>> GRONCKLE_FEMALE = register("gronckle_female", EntityType.Builder.<GronckleFemaleEntity>of(GronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleFemaleEntity::new).fireImmune().sized(2f, 2f));
	public static final RegistryObject<EntityType<AdolescentGronckleMaleEntity>> ADOLESCENT_GRONCKLE_MALE = register("adolescent_gronckle_male",
			EntityType.Builder.<AdolescentGronckleMaleEntity>of(AdolescentGronckleMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleMaleEntity::new).fireImmune().sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<AdolescentGronckleFemaleEntity>> ADOLESCENT_GRONCKLE_FEMALE = register("adolescent_gronckle_female",
			EntityType.Builder.<AdolescentGronckleFemaleEntity>of(AdolescentGronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentGronckleFemaleEntity::new).fireImmune().sized(1.5f, 1.5f));
	public static final RegistryObject<EntityType<JuvenileGronckleMaleEntity>> JUVENILE_GRONCKLE_MALE = register("juvenile_gronckle_male", EntityType.Builder.<JuvenileGronckleMaleEntity>of(JuvenileGronckleMaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileGronckleMaleEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<JuvenileGronckleFemaleEntity>> JUVENILE_GRONCKLE_FEMALE = register("juvenile_gronckle_female",
			EntityType.Builder.<JuvenileGronckleFemaleEntity>of(JuvenileGronckleFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(JuvenileGronckleFemaleEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<BabyGronckleMaleEntity>> BABY_GRONCKLE_MALE = register("baby_gronckle_male", EntityType.Builder.<BabyGronckleMaleEntity>of(BabyGronckleMaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGronckleMaleEntity::new).fireImmune().sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BabyGronckleFemaleEntity>> BABY_GRONCKLE_FEMALE = register("baby_gronckle_female", EntityType.Builder.<BabyGronckleFemaleEntity>of(BabyGronckleFemaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyGronckleFemaleEntity::new).fireImmune().sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GronckleEggEntityEntity>> GRONCKLE_EGG_ENTITY = register("gronckle_egg_entity", EntityType.Builder.<GronckleEggEntityEntity>of(GronckleEggEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GronckleEggEntityEntity::new).fireImmune().sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<TTMaleEntity>> TT_MALE = register("tt_male",
			EntityType.Builder.<TTMaleEntity>of(TTMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TTMaleEntity::new)

					.sized(0.45f, 0.5f));
	public static final RegistryObject<EntityType<TestGronckleEntity>> TEST_GRONCKLE = register("test_gronckle", EntityType.Builder.<TestGronckleEntity>of(TestGronckleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestGronckleEntity::new).fireImmune().sized(2f, 2f));
	public static final RegistryObject<EntityType<TTFemaleEntity>> TT_FEMALE = register("tt_female",
			EntityType.Builder.<TTFemaleEntity>of(TTFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TTFemaleEntity::new)

					.sized(0.45f, 0.5f));
	public static final RegistryObject<EntityType<TTTestEntity>> TT_TEST = register("tt_test",
			EntityType.Builder.<TTTestEntity>of(TTTestEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TTTestEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BabyTTFemaleEntity>> BABY_TT_FEMALE = register("baby_tt_female",
			EntityType.Builder.<BabyTTFemaleEntity>of(BabyTTFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyTTFemaleEntity::new)

					.sized(0.15f, 0.2f));
	public static final RegistryObject<EntityType<JuvenileTTFemaleEntity>> JUVENILE_TT_FEMALE = register("juvenile_tt_female",
			EntityType.Builder.<JuvenileTTFemaleEntity>of(JuvenileTTFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileTTFemaleEntity::new)

					.sized(0.2f, 0.3f));
	public static final RegistryObject<EntityType<AdolescentTTFemaleEntity>> ADOLESCENT_TT_FEMALE = register("adolescent_tt_female",
			EntityType.Builder.<AdolescentTTFemaleEntity>of(AdolescentTTFemaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentTTFemaleEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<BabyTTMaleEntity>> BABY_TT_MALE = register("baby_tt_male",
			EntityType.Builder.<BabyTTMaleEntity>of(BabyTTMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyTTMaleEntity::new)

					.sized(0.15f, 0.2f));
	public static final RegistryObject<EntityType<JuvenileTTMaleEntity>> JUVENILE_TT_MALE = register("juvenile_tt_male",
			EntityType.Builder.<JuvenileTTMaleEntity>of(JuvenileTTMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileTTMaleEntity::new)

					.sized(0.2f, 0.3f));
	public static final RegistryObject<EntityType<AdolescentTTMaleEntity>> ADOLESCENT_TT_MALE = register("adolescent_tt_male",
			EntityType.Builder.<AdolescentTTMaleEntity>of(AdolescentTTMaleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentTTMaleEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<TTEggEntityEntity>> TT_EGG_ENTITY = register("tt_egg_entity",
			EntityType.Builder.<TTEggEntityEntity>of(TTEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TTEggEntityEntity::new)

					.sized(0.3f, 0.4f));
	public static final RegistryObject<EntityType<NadderMaleEntity>> NADDER_MALE = register("nadder_male", EntityType.Builder.<NadderMaleEntity>of(NadderMaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(NadderMaleEntity::new).fireImmune().sized(1.2f, 2.5f));
	public static final RegistryObject<EntityType<TestNadderEntity>> TEST_NADDER = register("test_nadder", EntityType.Builder.<TestNadderEntity>of(TestNadderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(TestNadderEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NadderFemaleEntity>> NADDER_FEMALE = register("nadder_female", EntityType.Builder.<NadderFemaleEntity>of(NadderFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NadderFemaleEntity::new).fireImmune().sized(1.2f, 2.5f));
	public static final RegistryObject<EntityType<BabyNadderFemaleEntity>> BABY_NADDER_FEMALE = register("baby_nadder_female", EntityType.Builder.<BabyNadderFemaleEntity>of(BabyNadderFemaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyNadderFemaleEntity::new).fireImmune().sized(0.4f, 0.6f));
	public static final RegistryObject<EntityType<BabyNadderMaleEntity>> BABY_NADDER_MALE = register("baby_nadder_male", EntityType.Builder.<BabyNadderMaleEntity>of(BabyNadderMaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyNadderMaleEntity::new).fireImmune().sized(0.4f, 0.6f));
	public static final RegistryObject<EntityType<JuvenileNadderMaleEntity>> JUVENILE_NADDER_MALE = register("juvenile_nadder_male", EntityType.Builder.<JuvenileNadderMaleEntity>of(JuvenileNadderMaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileNadderMaleEntity::new).fireImmune().sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<JuvenileNadderFemaleEntity>> JUVENILE_NADDER_FEMALE = register("juvenile_nadder_female", EntityType.Builder.<JuvenileNadderFemaleEntity>of(JuvenileNadderFemaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JuvenileNadderFemaleEntity::new).fireImmune().sized(0.6f, 1.2f));
	public static final RegistryObject<EntityType<AdolescentNadderFemaleEntity>> ADOLESCENT_NADDER_FEMALE = register("adolescent_nadder_female",
			EntityType.Builder.<AdolescentNadderFemaleEntity>of(AdolescentNadderFemaleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AdolescentNadderFemaleEntity::new).fireImmune().sized(0.9f, 2f));
	public static final RegistryObject<EntityType<AdolescentNadderMaleEntity>> ADOLESCENT_NADDER_MALE = register("adolescent_nadder_male", EntityType.Builder.<AdolescentNadderMaleEntity>of(AdolescentNadderMaleEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolescentNadderMaleEntity::new).fireImmune().sized(0.9f, 2f));
	public static final RegistryObject<EntityType<NadderEggEntityEntity>> NADDER_EGG_ENTITY = register("nadder_egg_entity",
			EntityType.Builder.<NadderEggEntityEntity>of(NadderEggEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NadderEggEntityEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<ChickenEntity>> CHICKEN = register("chicken",
			EntityType.Builder.<ChickenEntity>of(ChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChickenEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<BabyChickenEntity>> BABY_CHICKEN = register("baby_chicken",
			EntityType.Builder.<BabyChickenEntity>of(BabyChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyChickenEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<YakEntity>> YAK = register("yak",
			EntityType.Builder.<YakEntity>of(YakEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YakEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<BabyYakEntity>> BABY_YAK = register("baby_yak",
			EntityType.Builder.<BabyYakEntity>of(BabyYakEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyYakEntity::new)

					.sized(0.5f, 1f));
	public static final RegistryObject<EntityType<SheepEntity>> SHEEP = register("sheep",
			EntityType.Builder.<SheepEntity>of(SheepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SheepEntity::new)

					.sized(0.7f, 1.1f));
	public static final RegistryObject<EntityType<BabySheepEntity>> BABY_SHEEP = register("baby_sheep",
			EntityType.Builder.<BabySheepEntity>of(BabySheepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabySheepEntity::new)

					.sized(0.5f, 0.7f));
	public static final RegistryObject<EntityType<AEntity>> A = register("a",
			EntityType.Builder.<AEntity>of(AEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GronckleAttackProjectileEntity>> GRONCKLE_ATTACK_PROJECTILE = register("projectile_gronckle_attack_projectile",
			EntityType.Builder.<GronckleAttackProjectileEntity>of(GronckleAttackProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(GronckleAttackProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NightFuryEntity.init();
			GronckleMaleEntity.init();
			GronckleFemaleEntity.init();
			AdolescentGronckleMaleEntity.init();
			AdolescentGronckleFemaleEntity.init();
			JuvenileGronckleMaleEntity.init();
			JuvenileGronckleFemaleEntity.init();
			BabyGronckleMaleEntity.init();
			BabyGronckleFemaleEntity.init();
			GronckleEggEntityEntity.init();
			TTMaleEntity.init();
			TestGronckleEntity.init();
			TTFemaleEntity.init();
			TTTestEntity.init();
			BabyTTFemaleEntity.init();
			JuvenileTTFemaleEntity.init();
			AdolescentTTFemaleEntity.init();
			BabyTTMaleEntity.init();
			JuvenileTTMaleEntity.init();
			AdolescentTTMaleEntity.init();
			TTEggEntityEntity.init();
			NadderMaleEntity.init();
			TestNadderEntity.init();
			NadderFemaleEntity.init();
			BabyNadderFemaleEntity.init();
			BabyNadderMaleEntity.init();
			JuvenileNadderMaleEntity.init();
			JuvenileNadderFemaleEntity.init();
			AdolescentNadderFemaleEntity.init();
			AdolescentNadderMaleEntity.init();
			NadderEggEntityEntity.init();
			ChickenEntity.init();
			BabyChickenEntity.init();
			YakEntity.init();
			BabyYakEntity.init();
			SheepEntity.init();
			BabySheepEntity.init();
			AEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NIGHT_FURY.get(), NightFuryEntity.createAttributes().build());
		event.put(GRONCKLE_MALE.get(), GronckleMaleEntity.createAttributes().build());
		event.put(GRONCKLE_FEMALE.get(), GronckleFemaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_MALE.get(), AdolescentGronckleMaleEntity.createAttributes().build());
		event.put(ADOLESCENT_GRONCKLE_FEMALE.get(), AdolescentGronckleFemaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_MALE.get(), JuvenileGronckleMaleEntity.createAttributes().build());
		event.put(JUVENILE_GRONCKLE_FEMALE.get(), JuvenileGronckleFemaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_MALE.get(), BabyGronckleMaleEntity.createAttributes().build());
		event.put(BABY_GRONCKLE_FEMALE.get(), BabyGronckleFemaleEntity.createAttributes().build());
		event.put(GRONCKLE_EGG_ENTITY.get(), GronckleEggEntityEntity.createAttributes().build());
		event.put(TT_MALE.get(), TTMaleEntity.createAttributes().build());
		event.put(TEST_GRONCKLE.get(), TestGronckleEntity.createAttributes().build());
		event.put(TT_FEMALE.get(), TTFemaleEntity.createAttributes().build());
		event.put(TT_TEST.get(), TTTestEntity.createAttributes().build());
		event.put(BABY_TT_FEMALE.get(), BabyTTFemaleEntity.createAttributes().build());
		event.put(JUVENILE_TT_FEMALE.get(), JuvenileTTFemaleEntity.createAttributes().build());
		event.put(ADOLESCENT_TT_FEMALE.get(), AdolescentTTFemaleEntity.createAttributes().build());
		event.put(BABY_TT_MALE.get(), BabyTTMaleEntity.createAttributes().build());
		event.put(JUVENILE_TT_MALE.get(), JuvenileTTMaleEntity.createAttributes().build());
		event.put(ADOLESCENT_TT_MALE.get(), AdolescentTTMaleEntity.createAttributes().build());
		event.put(TT_EGG_ENTITY.get(), TTEggEntityEntity.createAttributes().build());
		event.put(NADDER_MALE.get(), NadderMaleEntity.createAttributes().build());
		event.put(TEST_NADDER.get(), TestNadderEntity.createAttributes().build());
		event.put(NADDER_FEMALE.get(), NadderFemaleEntity.createAttributes().build());
		event.put(BABY_NADDER_FEMALE.get(), BabyNadderFemaleEntity.createAttributes().build());
		event.put(BABY_NADDER_MALE.get(), BabyNadderMaleEntity.createAttributes().build());
		event.put(JUVENILE_NADDER_MALE.get(), JuvenileNadderMaleEntity.createAttributes().build());
		event.put(JUVENILE_NADDER_FEMALE.get(), JuvenileNadderFemaleEntity.createAttributes().build());
		event.put(ADOLESCENT_NADDER_FEMALE.get(), AdolescentNadderFemaleEntity.createAttributes().build());
		event.put(ADOLESCENT_NADDER_MALE.get(), AdolescentNadderMaleEntity.createAttributes().build());
		event.put(NADDER_EGG_ENTITY.get(), NadderEggEntityEntity.createAttributes().build());
		event.put(CHICKEN.get(), ChickenEntity.createAttributes().build());
		event.put(BABY_CHICKEN.get(), BabyChickenEntity.createAttributes().build());
		event.put(YAK.get(), YakEntity.createAttributes().build());
		event.put(BABY_YAK.get(), BabyYakEntity.createAttributes().build());
		event.put(SHEEP.get(), SheepEntity.createAttributes().build());
		event.put(BABY_SHEEP.get(), BabySheepEntity.createAttributes().build());
		event.put(A.get(), AEntity.createAttributes().build());
	}
}
