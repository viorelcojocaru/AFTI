package test;
/**
 *  Anagrams that can be used
 *  <li>{@link #ABED}</li>
 *  <li>{@link #BADE}</li>
 *  <li>{@link #BEAD}</li>
 *  <li>{@link #BADE}</li>
 *  <li>{@link #BEAT}</li>
 *  <li>{@link #BETA}</li>
 *  <li>{@link #ABETS}</li>
 *  <li>{@link #BASTE}</li>
 *  <li>{@link #BETAS}</li>
 *  <li>{@link #BEAST}</li>
 *  <li>{@link #BEATS}</li>
 *  <li>{@link #ABUT}</li>
 *  <li>{@link #TABU}</li>
 *  <li>{@link #TUBA}</li>
 *  <li>{@link #ACME}</li>
 *  <li>{@link #CAME}</li>
 *  <li>{@link #MACE}</li>
 *  <li>{@link #ACRE}</li>
 *  <li>{@link #CARE}</li>
 *  <li>{@link #RACE}</li>
 *  <li>{@link #ACRES}</li>
 *  <li>{@link #CARES}</li>
 *  <li>{@link #RACES}</li>
 *  <li>{@link #SCARE}</li>
 *  <li>{@link #ACTOR}</li>
 *  <li>{@link #COSTA}</li>
 *  <li>{@link #CASTOR}</li>
 *  <li>{@link #ACTRESS}</li>
 *  <li>{@link #CASTERS}</li>
 *  <li>{@link #RECASTS}</li>
 *  <li>{@link #AIRMEN}</li>
 *  <li>{@link #MARINE}</li>
 *  <li>{@link #REMAIN}</li>
 *  <li>{@link #ALERT}</li>
 *  <li>{@link #ALTER}</li>
 *  <li>{@link #LATER}</li>
 *  <li>{@link #ALERTED}</li>
 *  <li>{@link #TREADLE}</li>
 *  <li>{@link #ALES}</li>
 *  <li>{@link #LEAS}</li>
 *  <li>{@link #SALE}</li>
 *  <li>{@link #SEAL}</li>
 *  <li>{@link #ALIGNED}</li>
 *  <li>{@link #DEALING}</li>
 *  <li>{@link #LEADING}</li>
 *  <li>{@link #ALLERGY}</li>
 *  <li>{@link #GALLERY}</li>
 *  <li>{@link #LARGELY}</li>
 *  <li>{@link #REGALLY}</li>
 *  <li>{@link #AMEN}</li>
 *  <li>{@link #MEAN}</li>
 *  <li>{@link #NAME}</li>
 *  <li>{@link #ANEW}</li>
 *  <li>{@link #WANE}</li>
 *  <li>{@link #WEAN}</li>
 *  <li>{@link #ANGEL}</li>
 *  <li>{@link #ANGLE}</li>
 *  <li>{@link #GLEAN}</li>
 *  <li>{@link #ANTLER}</li>
 *  <li>{@link #LEARNT}</li>
 *  <li>{@link #RENTAL}</li>
 *  <li>{@link #APT}</li>
 *  <li>{@link #PAT}</li>
 *  <li>{@link #TAP}</li>
 */

public enum Anagrams {

	ABED("abed"),
	BADE("bade"),
	BEAD("bead"),
	ABET("abet"),
	BEAT("beat"),
	BETA("beta"),
	ABETS("abets"),
	BASTE("baste"),
	BETAS("betas"),
	BEAST("beast"),
	BEATS("beats"),
	ABUT("abut"),
	TABU("tabu"),
	TUBA("tuba"),
	ACME("acme"),
	CAME("came"),
	MACE("mace"),
	ACRE("acre"),
	CARE("care"),
	RACE("race"),
	ACRES("acres"),
	CARES("cares"),
	RACES("races"),
	SCARE("scare"),
	ACTORS("actors"),
	COSTAR("costar"),
	CASTOR("castor"),
	ACTRESS("actress"),
	CASTERS("casters"),
	RECASTS("recasts"),
	AIRMEN("airmen"),
	MARINE("marine"),
	REMAIN("remain"),
	ALERT("alert"),
	ALTER("alter"),
	LATER("later"),
	ALERTED("alerted"),
	ALTERED("altered"),
	RELATED("related"),
	TREADLE("treadle"),
	ALES("ales"),
	LEAS("leas"),
	SALE("sale"),
	SEAL("seal"),
	ALIGNED("aligned"),
	DEALING("dealing"),
	LEADING("leading"),
	ALLERGY("allergy"),
	GALLERY("gallery"),
	LARGELY("largely"),
	REGALLY("regally"),
	AMEN("amen"),
	MEAN("mean"),
	NAME("name"),
	ANEW("anew"),
	WANE("wane"),
	WEAN("wean"),
	ANGEL("angel"),
	ANGLE("angle"),
	GLEAN("glean"),
	ANTLER("antler"),
	LEARNT("learnt"),
	RENTAL("rental"),
	APT("apt"),
	PAT("pat"),
	TAP("tap");


	private Anagrams(String anagram) {
		this._anagram = anagram;
	}

	private String _anagram;

	public String getAnagram() {
		return this._anagram;
	}

	public void setAnagram(String anagram) {
		this._anagram = anagram;
	}

	public String toString() {
		return this._anagram;
	}

	public static boolean contains(String s) {
		for (Anagrams anagrams : values())
			if (anagrams.getAnagram().equals(s))
				return true;
		return false;
	}
}
