package com.lilithsthrone.game.sex.sexActions;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.lilithsthrone.game.sex.sexActions.baseActions.ClitAnus;
import com.lilithsthrone.game.sex.sexActions.baseActions.ClitClit;
import com.lilithsthrone.game.sex.sexActions.baseActions.ClitMouth;
import com.lilithsthrone.game.sex.sexActions.baseActions.ClitNipple;
import com.lilithsthrone.game.sex.sexActions.baseActions.ClitNippleCrotch;
import com.lilithsthrone.game.sex.sexActions.baseActions.ClitVagina;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerAnus;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerBreasts;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerBreastsCrotch;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerClit;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerFinger;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerMouth;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerNipple;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerNippleCrotch;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerPenis;
import com.lilithsthrone.game.sex.sexActions.baseActions.FingerVagina;
import com.lilithsthrone.game.sex.sexActions.baseActions.FootMouth;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisAnus;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisArmpit;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisAss;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisBreasts;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisBreastsCrotch;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisFeet;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisFoot;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisMouth;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisNipple;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisNippleCrotch;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisSpinneret;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisThighs;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisUrethraPenis;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisUrethraVagina;
import com.lilithsthrone.game.sex.sexActions.baseActions.PenisVagina;
import com.lilithsthrone.game.sex.sexActions.baseActions.TailAnus;
import com.lilithsthrone.game.sex.sexActions.baseActions.TailMouth;
import com.lilithsthrone.game.sex.sexActions.baseActions.TailVagina;
import com.lilithsthrone.game.sex.sexActions.baseActions.TentacleAnus;
import com.lilithsthrone.game.sex.sexActions.baseActions.TentacleMouth;
import com.lilithsthrone.game.sex.sexActions.baseActions.TentacleVagina;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueAnus;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueArmpit;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueBreasts;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueBreastsCrotch;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueMound;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueMouth;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueNipple;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueNippleCrotch;
import com.lilithsthrone.game.sex.sexActions.baseActions.TongueVagina;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.GenericActions;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.GenericOrgasms;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.GenericPositioning;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.GenericTalk;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.LovingActions;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.PartnerTalk;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.PlayerTalk;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.PositioningMenu;
import com.lilithsthrone.game.sex.sexActions.baseActionsMisc.SadisticActions;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfFingerAnus;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfFingerBreasts;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfFingerCrotchNipple;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfFingerMouth;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfFingerNipple;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfFingerPenis;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfFingerVagina;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfNoPen;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfPenisAnus;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfPenisMouth;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfPenisNipple;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfPenisVagina;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfTailAnus;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfTailMouth;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfTailNipple;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfTailVagina;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfTongueAnus;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfTongueMouth;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfTongueNipple;
import com.lilithsthrone.game.sex.sexActions.baseActionsSelf.SelfTongueVagina;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.Value;

/**
 * Handles the loading and id generation of SexActions from both internal and external files.
 * 
 * @since 0.4.1
 * @version 0.4.1
 * @author Innoxia
 */
public class SexActionManager {
	
	private static List<SexAction> allSexActions = new ArrayList<>();
	private static Map<SexAction, String> sexActionToIdMap = new HashMap<>();
	private static Map<String, SexAction> idToSexActionMap = new HashMap<>();
	
	public static List<SexAction> getAllSexActions() {
		return allSexActions;
	}
	
	public static SexAction getSexActionFromId(String id) {
		id = id.trim(); // Just make sure that any parsed ids have been trimmed
		id = Util.getClosestStringMatch(id, idToSexActionMap.keySet());
		return idToSexActionMap.get(id);
	}
	
	public static String getIdFromSexAction(SexAction sexAction) {
		return sexActionToIdMap.get(sexAction);
	}
	
	static {
		// Modded sexActions:
		
		Map<String, Map<String, File>> moddedFilesMap = Util.getExternalModFilesById("/sex/actions");
		for(Entry<String, Map<String, File>> entry : moddedFilesMap.entrySet()) {
			for(Entry<String, File> innerEntry : entry.getValue().entrySet()) {
				try {
					SexActionExternal sexAction = new SexActionExternal(innerEntry.getValue(), innerEntry.getKey(), false);
					String id = innerEntry.getKey();
					id = id.replaceAll("sex_actions_", "");
					allSexActions.add(sexAction);
					sexActionToIdMap.put(sexAction, id);
					idToSexActionMap.put(id, sexAction);
//					System.out.println("modded sexAction: "+innerEntry.getKey());
				} catch(Exception ex) {
					System.err.println("Loading modded sexAction type failed at 'SexAction'. File path: "+innerEntry.getValue().getAbsolutePath());
					System.err.println("Actual exception: ");
					ex.printStackTrace(System.err);
				}
			}
		}
		
		// External res SexActions:
		
		// Ids are generated in the format 'author_folders_fileName'
		// Example: innoxia_meraxis_masturbation_orgasm_panties_cum
		Map<String, Map<String, File>> filesMap = Util.getExternalFilesById("res/sex");
		for(Entry<String, Map<String, File>> entry : filesMap.entrySet()) {
			for(Entry<String, File> innerEntry : entry.getValue().entrySet()) {
				if(Util.getXmlRootElementName(innerEntry.getValue()).equals("sexAction")) {
					try {
						SexActionExternal sexAction = new SexActionExternal(innerEntry.getValue(), innerEntry.getKey(), false);
						String id = innerEntry.getKey();
						id = id.replaceAll("actions_", "");
						allSexActions.add(sexAction);
						sexActionToIdMap.put(sexAction, id);
						idToSexActionMap.put(id, sexAction);
//						System.out.println("res sexAction: "+node.getId());
							
					} catch(Exception ex) {
						System.err.println("Loading sexAction type failed at 'SexAction'. File path: "+innerEntry.getValue().getAbsolutePath());
						System.err.println("Actual exception: ");
						ex.printStackTrace(System.err);
					}
				}
			}
		}

		// Add in hard-coded sex actions:
		
		Map<String, Field[]> sexActionClassIdToFields = Util.newHashMapOfValues(
				new Value<String, Field[]>("PositioningMenu", PositioningMenu.class.getFields()),
				new Value<String, Field[]>("GenericPositioning", GenericPositioning.class.getFields()),
				
				new Value<String, Field[]>("GenericActions", GenericActions.class.getFields()),
				new Value<String, Field[]>("GenericOrgasms", GenericOrgasms.class.getFields()),
				new Value<String, Field[]>("PlayerTalk", PlayerTalk.class.getFields()),
				new Value<String, Field[]>("PartnerTalk", PartnerTalk.class.getFields()),
				new Value<String, Field[]>("GenericTalk", GenericTalk.class.getFields()),

				// Sadistic actions:
				new Value<String, Field[]>("SadisticActions", SadisticActions.class.getFields()),

				// Gentle actions:
				new Value<String, Field[]>("LovingActions", LovingActions.class.getFields()),
				
				// Finger actions:
				new Value<String, Field[]>("FingerAnus", FingerAnus.class.getFields()),
				new Value<String, Field[]>("FingerBreasts", FingerBreasts.class.getFields()),
				new Value<String, Field[]>("FingerBreastsCrotch", FingerBreastsCrotch.class.getFields()),
				new Value<String, Field[]>("FingerMouth", FingerMouth.class.getFields()),
				new Value<String, Field[]>("FingerNipple", FingerNipple.class.getFields()),
				new Value<String, Field[]>("FingerNippleCrotch", FingerNippleCrotch.class.getFields()),
				new Value<String, Field[]>("FingerVagina", FingerVagina.class.getFields()),
				new Value<String, Field[]>("FingerClit", FingerClit.class.getFields()),
				new Value<String, Field[]>("FingerPenis", FingerPenis.class.getFields()),
				new Value<String, Field[]>("FingerFinger", FingerFinger.class.getFields()),

				// Oral actions:
				new Value<String, Field[]>("TongueMouth", TongueMouth.class.getFields()),
				new Value<String, Field[]>("TongueAnus", TongueAnus.class.getFields()),
				new Value<String, Field[]>("TongueVagina", TongueVagina.class.getFields()),
				new Value<String, Field[]>("ClitMouth", ClitMouth.class.getFields()),
				new Value<String, Field[]>("TongueMound", TongueMound.class.getFields()),
				new Value<String, Field[]>("TongueBreasts", TongueBreasts.class.getFields()),
				new Value<String, Field[]>("TongueBreastsCrotch", TongueBreastsCrotch.class.getFields()),
				new Value<String, Field[]>("TongueNipple", TongueNipple.class.getFields()),
				new Value<String, Field[]>("TongueNippleCrotch", TongueNippleCrotch.class.getFields()),
				new Value<String, Field[]>("FootMouth", FootMouth.class.getFields()),
				new Value<String, Field[]>("PenisMouth", PenisMouth.class.getFields()),
				new Value<String, Field[]>("TongueArmpits", TongueArmpit.class.getFields()),

				// Tail actions:
				new Value<String, Field[]>("TailAnus", TailAnus.class.getFields()),
				new Value<String, Field[]>("TailVagina", TailVagina.class.getFields()),
				new Value<String, Field[]>("TailMouth", TailMouth.class.getFields()),

				// Tentacle actions:
				new Value<String, Field[]>("TentacleAnus", TentacleAnus.class.getFields()),
				new Value<String, Field[]>("TentacleVagina", TentacleVagina.class.getFields()),
				new Value<String, Field[]>("TentacleMouth", TentacleMouth.class.getFields()),
				
				// Penis actions:
				new Value<String, Field[]>("PenisAss", PenisAss.class.getFields()),
				new Value<String, Field[]>("PenisAnus", PenisAnus.class.getFields()),
				new Value<String, Field[]>("PenisNipple", PenisNipple.class.getFields()),
				new Value<String, Field[]>("PenisNippleCrotch", PenisNippleCrotch.class.getFields()),
				new Value<String, Field[]>("PenisVagina", PenisVagina.class.getFields()),
				new Value<String, Field[]>("PenisBreasts", PenisBreasts.class.getFields()),
				new Value<String, Field[]>("PenisBreastsCrotch", PenisBreastsCrotch.class.getFields()),
				new Value<String, Field[]>("PenisThighs", PenisThighs.class.getFields()),
				new Value<String, Field[]>("PenisFoot", PenisFoot.class.getFields()),
				new Value<String, Field[]>("PenisFeet", PenisFeet.class.getFields()),
				new Value<String, Field[]>("PenisUrethraVagina", PenisUrethraVagina.class.getFields()),
				new Value<String, Field[]>("PenisUrethraPenis", PenisUrethraPenis.class.getFields()),
				new Value<String, Field[]>("PenisSpinneret", PenisSpinneret.class.getFields()),
				new Value<String, Field[]>("PenisArmpit", PenisArmpit.class.getFields()),
				
				// Vagina/clit actions:
				new Value<String, Field[]>("ClitClit", ClitClit.class.getFields()),
				new Value<String, Field[]>("ClitVagina", ClitVagina.class.getFields()),
				new Value<String, Field[]>("ClitAnus", ClitAnus.class.getFields()),
				new Value<String, Field[]>("ClitNipple", ClitNipple.class.getFields()),
				new Value<String, Field[]>("ClitNippleCrotch", ClitNippleCrotch.class.getFields()),
		
				// Self actions
				new Value<String, Field[]>("SelfNoPen", SelfNoPen.class.getFields()),
				new Value<String, Field[]>("SelfFingerAnus", SelfFingerAnus.class.getFields()),
				new Value<String, Field[]>("SelfFingerBreasts", SelfFingerBreasts.class.getFields()),
				new Value<String, Field[]>("SelfFingerCrotchNipple", SelfFingerCrotchNipple.class.getFields()),
				new Value<String, Field[]>("SelfFingerMouth", SelfFingerMouth.class.getFields()),
				new Value<String, Field[]>("SelfFingerNipple", SelfFingerNipple.class.getFields()),
				new Value<String, Field[]>("SelfFingerPenis", SelfFingerPenis.class.getFields()),
				new Value<String, Field[]>("SelfFingerVagina", SelfFingerVagina.class.getFields()),
				
				new Value<String, Field[]>("SelfPenisAnus", SelfPenisAnus.class.getFields()),
				new Value<String, Field[]>("SelfPenisMouth", SelfPenisMouth.class.getFields()),
				new Value<String, Field[]>("SelfPenisNipple", SelfPenisNipple.class.getFields()),
				new Value<String, Field[]>("SelfPenisVagina", SelfPenisVagina.class.getFields()),

				new Value<String, Field[]>("SelfTailAnus", SelfTailAnus.class.getFields()),
				new Value<String, Field[]>("SelfTailMouth", SelfTailMouth.class.getFields()),
				new Value<String, Field[]>("SelfTailNipple", SelfTailNipple.class.getFields()),
				new Value<String, Field[]>("SelfTailVagina", SelfTailVagina.class.getFields()),

				new Value<String, Field[]>("SelfTongueAnus", SelfTongueAnus.class.getFields()),
				new Value<String, Field[]>("SelfTongueMouth", SelfTongueMouth.class.getFields()),
				new Value<String, Field[]>("SelfTongueNipple", SelfTongueNipple.class.getFields()),
				new Value<String, Field[]>("SelfTongueVagina", SelfTongueVagina.class.getFields()));
				
		for(Entry<String, Field[]> entry : sexActionClassIdToFields.entrySet()) {
			for(Field f : entry.getValue()) {
				if (SexAction.class.isAssignableFrom(f.getType())) {
					SexAction sexAction;
					try {
						sexAction = ((SexAction) f.get(null));
						
						String id = entry.getKey()+"_"+f.getName();
						
						sexActionToIdMap.put(sexAction, id);
						idToSexActionMap.put(id, sexAction);
						
						allSexActions.add(sexAction);
						
					} catch (IllegalArgumentException | IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
