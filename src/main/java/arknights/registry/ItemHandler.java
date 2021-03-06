package arknights.registry;

import arknights.item.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashMap;
import java.util.Map;

import static arknights.Arknights.ARKNIGHTS;
import static arknights.Arknights.MODID;
import static net.minecraft.util.text.TextFormatting.*;

public class ItemHandler {

    static TextFormatting COMMON = WHITE;
    static TextFormatting UNCOMMON = YELLOW;
    static TextFormatting RARE = AQUA;
    static TextFormatting EPIC = LIGHT_PURPLE;
    static TextFormatting LEGEND = GOLD;

    public static Map<Integer, Item> mapOfId = new HashMap<>();

    public static final Item ORIGINITEPRIME = new OriginitePrime(new Item.Properties().group(ARKNIGHTS)).setRegistryName(MODID+":originite_prime");
    public static final Item ORIGINIUMSHARD = createItem("originium_shard", 1001, LEGEND);
    public static final Item PUREGOLD = createItem("pure_gold", 1000, EPIC);

    public static final Item TESTSWORD = new TestSword(new Item.Properties().group(ARKNIGHTS)).setRegistryName(MODID + ":" + "testsword");
    public static final Item JB = new Apulupai(new Item.Properties().group(ARKNIGHTS)).setRegistryName(MODID + ":" + "jb");


    public static final Item ORIROCK = createItem("orirock", 1, COMMON);
    public static final OrirockCube ORIROCKCUBE = (OrirockCube) new OrirockCube(BlockHandler.ORIROCKCUBE, new Item.Properties().group(ARKNIGHTS)).setRegistryName(BlockHandler.ORIROCKCUBE.getRegistryName());
    public static final Item ORIROCKCLUSTER = createItem("orirock_cluster", 3, RARE, 2, 5);
    public static final Item ORIROCKCONCENTRATION = createItem("orirock_concentration", 4, EPIC, 3, 4);

    public static final Item SUGARSUBSTITUTE = createItem("sugar_substitute", 5, COMMON);
    public static final Item SUGAR = createItem("sugar", 6, UNCOMMON, 5, 3);
    public static final Item SUGARPACK = createItem("sugar_pack", 7, RARE, 6, 4);
    public static final Item SUGARLUMP = createItem("sugar_lump", 48, EPIC, 7, 2, 15, 1, 26, 1);

    public static final Item ESTER = createItem("ester", 9, COMMON);
    public static final Item POLYESTER = createItem("polyester", 10, UNCOMMON, 9, 3);
    public static final Item POLYESTERPACK = createItem("polyester_pack", 11, RARE, 10, 4);
    public static final Item POLYESTERLUMP = createItem("polyester_lump", 55, EPIC, 11, 2, 19, 1, 25, 1);

    public static final Item ORIRONSHARD= createItem("oriron_shard", 13, COMMON);
    public static final Item ORIRON = createItem("oriron", 14, UNCOMMON, 13, 3);
    public static final Item ORIRONCLUSTER = createItem("oriron_cluster", 15, RARE, 14, 4);
    public static final Item ORIRONBLOCK = createItem("oriron_block", 49, EPIC, 15, 2, 23, 1, 11, 1);

    public static final Item DIKETON = createItem("diketon", 17, COMMON);
    public static final Item POLYKETON = createItem("polyketon", 18, UNCOMMON, 17, 3);
    public static final Item AKETON = createItem("aketon", 19, RARE, 18, 4);
    public static final Item KETONCOLLOID = createItem("keton_colloid", 52, EPIC, 19, 2, 7, 1, 26, 1);

    public static final Item DAMAGEDDEVICE = createItem("damaged_device", 21, COMMON);
    public static final Item DEVICE = createItem("device", 22, UNCOMMON, 21, 3);
    public static final Item INTEGRATEDDEVICE = createItem("integrated_device", 23, RARE, 22, 4);
    public static final Item OPTMIZEDDEVICE = createItem("optimized_device", 56, EPIC, 23, 1, 3, 2, 30, 1);

    public static final Item LOXICKOHL = createItem("loxic_kohl", 25, RARE);
    public static final Item WHITEHORSEKOHL = createItem("white_horse_kohl", 59, EPIC, 25, 1, 7, 1, 27, 1);

    public static final Item MANGANESEORE = createItem("manganese_ore", 26, RARE);
    public static final Item MANGANESETRIHYDRATE = createItem("manganese_trihydrate", 62, EPIC, 26, 2, 11, 1, 25, 1);

    public static final Item RMA7012 = createItem("rma70_12", 27, RARE);
    public static final Item RMA7024 = createItem("rma70_24", 50, EPIC, 27, 1, 3, 2, 19, 1);

    //凝胶、炽合金

    public static final Item GRINDSTONE = createItem("grindstone", 30, RARE);
    public static final Item GRINDSTONEPENTAHYDRATE = createItem("grindstone_pentahydrate", 68, EPIC, 30, 1, 15, 1, 23, 1);

    public static final Item D32STEEL = createItem("d32_steel", 179, LEGEND, 62, 1, 68, 1, 49, 1);
    public static final Item BIPOLARNANOFLAKE = createItem("bipolar_nanoflake", 105, LEGEND, 4, 1, 49, 1, 52, 1);
    public static final Item POLYMERIZATIONPREPERATION = createItem("polymerization_preperation", 115, LEGEND, 56, 1, 59, 2, 0, 0);

    public static final BlockItem TRADINGHOME_ITEM = createBlockItem(BlockHandler.TRADINGHOME);
    public static final BlockItem ORIGINIUMS = createBlockItem(BlockHandler.ORIGINITEPRIME_BLOCK);
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> evt){
        IForgeRegistry<Item> r = evt.getRegistry();
        r.register(ORIGINITEPRIME);
        r.register(ORIGINIUMSHARD);
        r.register(PUREGOLD);

        r.register(ORIROCK);
        r.register(ORIROCKCUBE);
        r.register(ORIROCKCLUSTER);
        r.register(ORIROCKCONCENTRATION);
        r.register(SUGARSUBSTITUTE);
        r.register(SUGAR);
        r.register(SUGARPACK);
        r.register(SUGARLUMP);
        r.register(ESTER);
        r.register(POLYESTER);
        r.register(POLYESTERPACK);
        r.register(POLYESTERLUMP);
        r.register(ORIRONSHARD);
        r.register(ORIRON);
        r.register(ORIRONCLUSTER);
        r.register(ORIRONBLOCK);
        r.register(DIKETON);
        r.register(POLYKETON);
        r.register(AKETON);
        r.register(KETONCOLLOID);
        r.register(DAMAGEDDEVICE);
        r.register(DEVICE);
        r.register(INTEGRATEDDEVICE);
        r.register(OPTMIZEDDEVICE);
        r.register(LOXICKOHL);
        r.register(WHITEHORSEKOHL);
        r.register(MANGANESEORE);
        r.register(MANGANESETRIHYDRATE);
        r.register(RMA7012);
        r.register(RMA7024);
        r.register(GRINDSTONE);
        r.register(GRINDSTONEPENTAHYDRATE);
        r.register(D32STEEL);
        r.register(BIPOLARNANOFLAKE);
        r.register(POLYMERIZATIONPREPERATION);
        r.register(JB);
        r.register(TESTSWORD);

        r.register(TRADINGHOME_ITEM);
        r.register(ORIGINIUMS);
    }

    private static Item createItem(String name, int id, TextFormatting color, int item1, int num1, int item2, int num2, int item3, int num3){
        MaterialItem item = (MaterialItem) new MaterialItem(new Item.Properties().group(ARKNIGHTS), id, color, item1, num1, item2, num2, item3, num3).setRegistryName(MODID + ":" + name);
        mapOfId.put(id, item);
        return item;
    }

    private static Item createItem(String name, int id, TextFormatting color){
        MaterialItem item = (MaterialItem) new MaterialItem(new Item.Properties().group(ARKNIGHTS), id, color, 0, 0, 0, 0, 0, 0).setRegistryName(MODID + ":" + name);
        mapOfId.put(id, item);
        return item;
    }

    private static Item createItem(String name, int id, TextFormatting color, int id1, int num1){
        MaterialItem item = (MaterialItem) new MaterialItem(new Item.Properties().group(ARKNIGHTS), id, color, id1, num1, 0, 0, 0, 0).setRegistryName(MODID + ":" + name);
        mapOfId.put(id, item);
        return item;
    }

    private static BlockItem createBlockItem(Block block){
        return (BlockItem) new BlockItem(block, new Item.Properties().group(ARKNIGHTS)).setRegistryName(block.getRegistryName());
    }
}
