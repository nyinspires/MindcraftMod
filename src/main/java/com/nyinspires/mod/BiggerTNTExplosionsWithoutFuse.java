package com.nyinspires.mod;


import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BiggerTNTExplosionsWithoutFuse {

	float power = 32.0F;

	@SubscribeEvent
	public void explode(EntityJoinWorldEvent event) {
		if (!(event.getEntity() instanceof EntityTNTPrimed)) {
			return;
		}
		Entity entity = event.getEntity();
		event.getEntity().getEntityWorld().createExplosion(entity, entity.posX, entity.posY,
				entity.posZ, power, true);
	}

}
