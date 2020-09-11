import java.util.TreeMap;
/**
 * Write a description of class libpartsLibary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class libpartLibary
{
    // instance variables - replace the example below with your own
    public TreeMap<String,String> libparts = new TreeMap<String,String>();
    String s = NetlistToPCBnew.lineSep;
    public TreeMap<String, Boolean> alreadyPrinted = new TreeMap<String, Boolean>(); 
    /**
     * Constructor for objects of class libpartsLibary
     */
    public libpartLibary() {
        // initialise instance variables
        libparts.put("resistor", "    (libpart (lib Device) (part R)" + s + "      (description Resistor)" + s + "      (docs ~)" + s + "      (footprints" + s + "        (fp R_*))" + s + "      (fields" + s + "        (field (name Reference) R)" + s + "        (field (name Value) R))" + s + "      (pins" + s + "        (pin (num 1) (name ~) (type passive))" + s + "        (pin (num 2) (name ~) (type passive))))");
        libparts.put("capacitor", "    (libpart (lib Device) (part C)" + s + "      (description \"Unpolarized capacitor\")" + s + "      (docs ~)" + s + "      (footprints" + s + "        (fp C_*))" + s + "      (fields" + s + "        (field (name Reference) C)" + s + "        (field (name Value) C))" + s + "      (pins" + s + "        (pin (num 1) (name ~) (type passive))" + s + "        (pin (num 2) (name ~) (type passive))))");
        libparts.put("inductor", "    (libpart (lib Device) (part L)" + s + "      (description Inductor)" + s + "      (docs ~)" + s + "      (footprints" + s + "        (fp Choke_*)" + s + "        (fp *Coil*)" + s + "        (fp Inductor_*)" + s + "        (fp L_*))" + s + "      (fields" + s + "        (field (name Reference) L)" + s + "        (field (name Value) L))" + s + "      (pins" + s + "        (pin (num 1) (name 1) (type passive))" + s + "        (pin (num 2) (name 2) (type passive))))");
        libparts.put("LM324", "    (libpart (lib Amplifier_Operational) (part LM2902)" + s + "      (aliases" + s + "        (alias LM324)" + s + "        (alias TLC274)" + s + "        (alias TLC279)" + s + "        (alias TL074)" + s + "        (alias LM324A)" + s + "        (alias MCP6004)" + s + "        (alias TL084)" + s + "        (alias TL064)" + s + "        (alias LMV324)" + s + "        (alias LMC6484)" + s + "        (alias MCP604)" + s + "        (alias MC33079)" + s + "        (alias MC33174)" + s + "        (alias MC33179)" + s + "        (alias OPA1604)" + s + "        (alias OPA1679)" + s + "        (alias OPA4134)" + s + "        (alias OPA4340UA)" + s + "        (alias OPA4376)" + s + "        (alias MCP6L94)" + s + "        (alias TSV914)" + s + "        (alias ADA4807-4)" + s + "        (alias TSV994))" + s + "      (description \"Low-Power, Quad-Operational Amplifiers, DIP-14/SOIC-14/SSOP-14\")" + s + "      (docs http://www.ti.com/lit/ds/symlink/lm2902-n.pdf)" + s + "      (footprints" + s + "        (fp SOIC*3.9x8.7mm*P1.27mm*)" + s + "        (fp DIP*W7.62mm*)" + s + "        (fp TSSOP*4.4x5mm*P0.65mm*)" + s + "        (fp SSOP*5.3x6.2mm*P0.65mm*)" + s + "        (fp MSOP*3x3mm*P0.5mm*))" + s + "      (fields" + s + "        (field (name Reference) U)" + s + "        (field (name Value) LM2902))" + s + "      (pins" + s + "        (pin (num 1) (name ~) (type output))" + s + "        (pin (num 2) (name -) (type input))" + s + "        (pin (num 3) (name +) (type input))" + s + "        (pin (num 4) (name V+) (type power_in))" + s + "        (pin (num 5) (name +) (type input))" + s + "        (pin (num 6) (name -) (type input))" + s + "        (pin (num 7) (name ~) (type output))" + s + "        (pin (num 8) (name ~) (type output))" + s + "        (pin (num 9) (name -) (type input))" + s + "        (pin (num 10) (name +) (type input))" + s + "        (pin (num 11) (name V-) (type power_in))" + s + "        (pin (num 12) (name +) (type input))" + s + "        (pin (num 13) (name -) (type input))" + s + "        (pin (num 14) (name ~) (type output))))");
        libparts.put("LM2901", "    (libpart (lib Comparator) (part LM2901)" + s + "      (description \"Quad Differential Comparators, DIP-14/SOIC-14/TSSOP-14\")" + s + "      (docs https://www.st.com/resource/en/datasheet/lm2901.pdf)" + s + "      (footprints" + s + "        (fp SOIC*3.9x8.7mm*P1.27mm*)" + s + "        (fp DIP*W7.62mm*)" + s + "        (fp TSSOP*4.4x5mm*P0.65mm*))" + s + "      (fields" + s + "        (field (name Reference) U)" + s + "        (field (name Value) LM2901))" + s + "      (pins" + s + "        (pin (num 1) (name ~) (type openCol))" + s + "        (pin (num 2) (name ~) (type openCol))" + s + "        (pin (num 3) (name V+) (type power_in))" + s + "        (pin (num 4) (name -) (type input))" + s + "        (pin (num 5) (name +) (type input))" + s + "        (pin (num 6) (name -) (type input))" + s + "        (pin (num 7) (name +) (type input))" + s + "        (pin (num 8) (name -) (type input))" + s + "        (pin (num 9) (name +) (type input))" + s + "        (pin (num 10) (name -) (type input))" + s + "        (pin (num 11) (name +) (type input))" + s + "        (pin (num 12) (name V-) (type power_in))" + s + "        (pin (num 13) (name ~) (type openCol))" + s + "        (pin (num 14) (name ~) (type openCol))))");
        libparts.put("LM319", "    (libpart (lib Comparator) (part LM319)" + s + "      (description \"High Speed Dual Comparator, DIP-14/SOIC-14\")" + s + "      (docs http://www.ti.com/lit/ds/symlink/lm319-n.pdf)" + s + "      (footprints" + s + "        (fp SOIC*3.9x8.7mm*P1.27mm*)" + s + "        (fp DIP*W7.62mm*))" + s + "      (fields" + s + "        (field (name Reference) U)" + s + "        (field (name Value) LM319))" + s + "      (pins" + s + "        (pin (num 1) (name NC) (type NotConnected))" + s + "        (pin (num 2) (name NC) (type NotConnected))" + s + "        (pin (num 3) (name GND) (type passive))" + s + "        (pin (num 4) (name +) (type input))" + s + "        (pin (num 5) (name -) (type input))" + s + "        (pin (num 6) (name V-) (type power_in))" + s + "        (pin (num 7) (name ~) (type openCol))" + s + "        (pin (num 8) (name GND) (type passive))" + s + "        (pin (num 9) (name +) (type input))" + s + "        (pin (num 10) (name -) (type input))" + s + "        (pin (num 11) (name V+) (type power_in))" + s + "        (pin (num 12) (name ~) (type openCol))" + s + "        (pin (num 13) (name NC) (type NotConnected))" + s + "        (pin (num 14) (name NC) (type NotConnected))))");
        libparts.put("NE555", "    (libpart (lib Timer) (part NE555)" + s + "      (aliases" + s + "        (alias NE555D)" + s + "        (alias LM555xM)" + s + "        (alias ICM7555xB)" + s + "        (alias LMC555xM)" + s + "        (alias MC1455B)" + s + "        (alias TLC555xD)" + s + "        (alias NA555D)" + s + "        (alias SE555D)" + s + "        (alias SA555D))" + s + "      (description \"Precision Timers, 555 compatible, SOIC-8\")" + s + "      (docs http://www.ti.com/lit/ds/symlink/ne555.pdf)" + s + "      (footprints" + s + "        (fp SOIC*3.9x4.9mm*P1.27mm*))" + s + "      (fields" + s + "        (field (name Reference) U)" + s + "        (field (name Value) NE555D)" + s + "        (field (name Footprint) Package_SO:SOIC-8_3.9x4.9mm_P1.27mm))" + s + "      (pins" + s + "        (pin (num 1) (name GND) (type power_in))" + s + "        (pin (num 2) (name TR) (type input))" + s + "        (pin (num 3) (name Q) (type output))" + s + "        (pin (num 4) (name R) (type input))" + s + "        (pin (num 5) (name CV) (type input))" + s + "        (pin (num 6) (name THR) (type input))" + s + "        (pin (num 7) (name DIS) (type input))" + s + "        (pin (num 8) (name VCC) (type power_in))))");
        //libparts.put("MCP6004", libparts.get("NE555"));
        libparts.put("BS107","    (libpart (lib Transistor_FET) (part BS107)" + s + "      (aliases" + s + "        (alias BS108)" + s + "        (alias BS170))" + s + "      (description \"0.25A Id, 200V Vds, N-Channel MOSFET, TO-92\")" + s + "      (docs http://www.onsemi.com/pub_link/Collateral/BS107-D.PDF)" + s + "      (footprints" + s + "        (fp TO?92*))" + s + "      (fields" + s + "        (field (name Reference) Q)" + s + "        (field (name Value) BS107)" + s + "        (field (name Footprint) Package_TO_SOT_THT:TO-92_Inline))" + s + "      (pins" + s + "        (pin (num 1) (name D) (type passive))" + s + "        (pin (num 2) (name G) (type input))" + s + "        (pin (num 3) (name S) (type passive))))");
        //libparts.put("BS170", libparts.get("BS107"));
        libparts.put("BSS138", "    (libpart (lib Transistor_FET) (part BSS138)" + s + "      (aliases" + s + "        (alias 2N7002)" + s + "        (alias 2N7002E)" + s + "        (alias 2N7002H)" + s + "        (alias 2N7002K)" + s + "        (alias BS170F)" + s + "        (alias BS870)" + s + "        (alias BSN20)" + s + "        (alias BSS123)" + s + "        (alias BSS127S)" + s + "        (alias DMG2302U)" + s + "        (alias DMG3402L)" + s + "        (alias DMG3404L)" + s + "        (alias DMG3406L)" + s + "        (alias DMG3414U)" + s + "        (alias DMG3418L)" + s + "        (alias DMN10H220L)" + s + "        (alias DMN10H700S)" + s + "        (alias DMN13H750S)" + s + "        (alias DMN2041L)" + s + "        (alias DMN2050L)" + s + "        (alias DMN2056U)" + s + "        (alias DMN2058U)" + s + "        (alias DMN2075U)" + s + "        (alias DMN2230U)" + s + "        (alias DMN24H11DS)" + s + "        (alias DMN24H3D5L)" + s + "        (alias DMN3042L)" + s + "        (alias DMN3051L)" + s + "        (alias DMN30H4D0L)" + s + "        (alias DMN3110S)" + s + "        (alias DMN3150L)" + s + "        (alias DMN3300U)" + s + "        (alias DMN3404L)" + s + "        (alias DMN6075S)" + s + "        (alias DMN6140L)" + s + "        (alias DMN67D7L)" + s + "        (alias DMN67D8L)" + s + "        (alias MMBF170)" + s + "        (alias VN10LF)" + s + "        (alias ZVN3306)" + s + "        (alias ZVN3306F)" + s + "        (alias ZVN3310F)" + s + "        (alias ZVN3320F)" + s + "        (alias ZVN4106F)" + s + "        (alias ZXM61N02F)" + s + "        (alias ZXM61N03F)" + s + "        (alias ZXMN10A07F)" + s + "        (alias ZXMN2A01F)" + s + "        (alias ZXMN2A14F)" + s + "        (alias ZXMN2B01F)" + s + "        (alias ZXMN2B14FH)" + s + "        (alias ZXMN2F30FH)" + s + "        (alias ZXMN2F34FH)" + s + "        (alias ZXMN3A01F)" + s + "        (alias ZXMN3A14F)" + s + "        (alias ZXMN3B01F)" + s + "        (alias ZXMN3B14F)" + s + "        (alias ZXMN3F30FH)" + s + "        (alias ZXMN6A07F)" + s + "        (alias IRLML0030)" + s + "        (alias IRLML2060)" + s + "        (alias TSM2302CX))" + s + "      (description \"50V Vds, 0.22A Id, N-Channel MOSFET, SOT-23\")" + s + "      (docs https://www.fairchildsemi.com/datasheets/BS/BSS138.pdf)" + s + "      (footprints" + s + "        (fp SOT?23*))" + s + "      (fields" + s + "        (field (name Reference) Q)" + s + "        (field (name Value) BSS138)" + s + "        (field (name Footprint) Package_TO_SOT_SMD:SOT-23))" + s + "      (pins" + s + "        (pin (num 1) (name G) (type input))" + s + "        (pin (num 2) (name S) (type passive))" + s + "        (pin (num 3) (name D) (type passive)))))");
        //libparts.put("ZVN3306", libparts.get("BSS138"));
        libparts.put("battery", "    (libpart (lib Device) (part Battery)" + s + "      (description \"Multiple-cell battery\")" + s + "      (docs ~)" + s + "      (fields" + s + "        (field (name Reference) BT)" + s + "        (field (name Value) Battery))" + s + "      (pins" + s + "        (pin (num 1) (name +) (type passive))" + s + "        (pin (num 2) (name -) (type passive))))");
        
        alreadyPrinted.put("resistor", false);
        alreadyPrinted.put("capacitor", false);
        alreadyPrinted.put("inductor", false);
        alreadyPrinted.put("LM324", false);
        alreadyPrinted.put("LM2901", false);
        alreadyPrinted.put("LM319", false);
        alreadyPrinted.put("NE555", false);
        alreadyPrinted.put("MCP6004", false);
        alreadyPrinted.put("BS107", false);
        alreadyPrinted.put("BS170", false);
        alreadyPrinted.put("BSS138", false);
        alreadyPrinted.put("ZVN3306", false);
        alreadyPrinted.put("battery", false);
        
    }
}





