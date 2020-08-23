//This class defines the drill text for the different sizes
package CodeGenerator.common;

public class DrillCycle 
{
private String tapDrillSize;
private String tapPitch;
private String DrillRPM;
private String TapRPM = "";
private String DFeedRate;
private String TFeedRate; //Calculation
private String DDepth;
private String TDepth;
private String DrillToolNo;
private String TapToolNo;
private int CycleDeterminer;
private String CounterBoreDepth;

//public DrillCycle(String DrillS, String TPitch, String DRPM, String TRPM, String DFRate, String TFRate, String DD, String TD) 

    public DrillCycle(String DrillS, String TPitch, String DRPM, String TRPM, String DFRate, String DD, String TD, String DTNo, String TTNo, int CycleD, String CBD)
    {
    	tapDrillSize = DrillS;
    	tapPitch = TPitch;
    	DrillRPM = DRPM;
    	TapRPM = TRPM;
    	DFeedRate = DFRate;
    	DDepth = DD;
    	TDepth = TD;
    	DrillToolNo = DTNo;
    	TapToolNo = TTNo;
    	CycleDeterminer = CycleD;
    	CounterBoreDepth = CBD;
    	

    	
    }
//	try 
//	{
//	int ITRPM = Integer.parseInt(TRPM);
//	int ITPitch = Integer.parseInt(tapPitch);
//	int ITFeedRate = ITRPM *  ITPitch;
//	TFeedRate = Integer.toString(ITFeedRate);
//	}
//	catch(Exception e1) 
//	{
//	   TFeedRate = "Invalid Pitch or RPM!";
//	}
	

//  SetMethods------------------------------------------------------
    
    public void SetDrillSize(String result)
    {tapDrillSize = result;}
    public void SetTapPitch(String result)
    {tapPitch = result;}
    public void SetDrillRPM(String result)
    {DrillRPM = result;}
    public void SetTapRPM(String result)
    {TapRPM = result;}
    public void SetDFeedRate(String result)
    {DFeedRate = result;}
    public void SetDDepth(String result)
    {DDepth = result;}
    public void SetTDepth(String result)
    {TDepth = result;}
    public void SetDTNo(String result)
    {DrillToolNo = result;}
    public void SetTTNo(String result)
    {TapToolNo = result;}
    public void SetCycleD(int result)
    {CycleDeterminer = result;}
    public void SetCBD(String result)
    {CounterBoreDepth = result;}
    
//  getMethods---------------------------------------------------
    
    public String getDrillS()
    {return tapDrillSize;}
    public String getTapPitch()
    {return tapPitch;}
    public String getDRPM()
    {return DrillRPM;}
    public String getTRPM()
    {return TapRPM;}
    public String getDFRate()
    {return DFeedRate;}
    public String getTFRate()
    {return TFeedRate;}
    public String getDD()
    {return DDepth;}
    public String getTD()
    {return TDepth;}
    public String getDTNo()
    {return DrillToolNo;}
    public String getTTNo()
    {return TapToolNo;}
    public int getCycleD()
    {return CycleDeterminer;}
    public String getCBD()
    {return CounterBoreDepth;}
    
    
    
    public static String DisplayAutoDrillCycle(String Size, String XLoc, String YLoc, String Depth, String RValue)
    {
    	String cycle;
    	cycle = "Size \nXLoc \nYLoc \nDepth \nRValue";
    	return cycle;
    }

}
