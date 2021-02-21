import java.lang.IllegalArgumentException;

public class BlueBlockFactory extends BlockFactory
{
    @Override
    public Block createBlock(String material)
    {
        if (material == "Plastic")
            return new BluePlasticBlock();
            
        else if (material == "Metal")
            return new BlueMetalBlock();
            
        else if (material == "Wood")
            return new BlueWoodBlock();
            
        else throw new IllegalArgumentException("There is no class definition for the name Blue" + material + "Block");
    }
}
