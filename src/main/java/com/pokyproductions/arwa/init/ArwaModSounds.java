
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.pokyproductions.arwa.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class ArwaModSounds {
	public static SoundEvent ARWAHURT = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwahurt"));
	public static SoundEvent ARWADEATH = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwadeath"));
	public static SoundEvent ARWAPURR = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwapurr"));
	public static SoundEvent ARWAALERT = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwaalert"));
	public static SoundEvent ARWAAGREE = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwaagree"));
	public static SoundEvent ARWADISAGREE = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwadisagree"));
	public static SoundEvent ARWAFEAR = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwafear"));
	public static SoundEvent ARWAGROWL = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwagrowl"));
	public static SoundEvent ARWALAUGH = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwalaugh"));
	public static SoundEvent ARWASUPRISE = SoundEvent.createVariableRangeEvent(new ResourceLocation("arwa", "arwasuprise"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwahurt"), ARWAHURT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwadeath"), ARWADEATH);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwapurr"), ARWAPURR);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwaalert"), ARWAALERT);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwaagree"), ARWAAGREE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwadisagree"), ARWADISAGREE);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwafear"), ARWAFEAR);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwagrowl"), ARWAGROWL);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwalaugh"), ARWALAUGH);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("arwa", "arwasuprise"), ARWASUPRISE);
	}
}
