package guru.deorcraft.proxy;

import guru.deorcraft.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
	}

}
