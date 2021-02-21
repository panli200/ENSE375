import java.lang.IllegalArgumentException;

public abstract class BlockFactory
{
	public Block createBlock(String material)
	{
		if (material == "Plastic")
			return new RedPlasticBlock();
		
		else if (material == "Metal")
			return new RedMetalBlock();
		
		else if (material == "Wood")
			return new RedWoodBlock();
		
		else throw new IllegalArgumentException("No class definition for the name Red" + material + "Block");
	}
}
