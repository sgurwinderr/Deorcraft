package guru.deorcraft;

public class Reference {
	public static final String MOD_ID="deorid";
	public static final String NAME="Deorcraft";
	public static final String VERSION="Aplha 0.1";
	public static final String ACCEPTED_VERSION="[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS="guru.deorcraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS="guru.deorcraft.proxy.ServerProxy";
	
	public static enum SourceItems{
		CHEESE("cheese","ItemCheese");
		
		private String unlocalizedName;
		private String registryName;
		SourceItems(String unlocalisedName,String registryName){
			this.unlocalizedName=unlocalisedName;
			this.registryName=registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
