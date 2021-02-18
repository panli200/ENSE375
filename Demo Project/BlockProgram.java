import java.util.ArrayList;

public class BlockProgram
{
    /*
        The intention of the BlockProgram class is to test the instantiation of derived class objects from a base class (Block) using the Factory Design Pattern.
        This file is heavily derived from the Winter 2021 ENSE 370 Lab #3 Assignment, which was written by Adam Tilson. It can be found at https://github.com/adamtilson/ense370/blob/main/lab-3/lab-doc.md
    */
  
    public BlockFactory blockFactory();
    public ArrayList<Block> blocks;
  
    public BlockProgram()
    {
        blockFactory = new BlueBlockFactory();
        blocks = new ArrayList<Block>();
    }
  
    public static void main(String[] args)
    {      
        BlockProgram blockProgram = new BlockProgram();
      
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Plastic"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Plastic"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Metal"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Metal"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Wood"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Wood"));
      
        blockProgram.blockFactory = new RedBlockFactory();
        
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Plastic"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Plastic"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Metal"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Metal"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Wood"));
        blockProgram.blocks.add(blockProgram.blockFactory.createBlock("Wood"));
        
        for (Block block : blockProgram.blocks)
            block.display();
      
        return;
    }
}
