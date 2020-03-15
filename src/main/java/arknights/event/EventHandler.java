package arknights.event;

import arknights.network.PacketHandler;
import arknights.network.packets.LeftClickPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static org.lwjgl.glfw.GLFW.*;

public class EventHandler {

    @SubscribeEvent
    public static void emptyLeftClick(PlayerInteractEvent.LeftClickEmpty event)
    {
        PacketHandler.HANDLER.sendToServer(new LeftClickPacket(true));
    }

    @SubscribeEvent
    public static void leftClickRelease(InputEvent.MouseInputEvent event)
    {
        if(Minecraft.getInstance().player != null){
            /*if(event.getButton() == GLFW_MOUSE_BUTTON_LEFT && event.getAction() == GLFW_PRESS){
                PacketHandler.HANDLER.sendToServer(new LeftClickPacket(true));
            } else */if (event.getAction() == GLFW_RELEASE){
                PacketHandler.HANDLER.sendToServer(new LeftClickPacket(false));
            }
        }
    }



}
