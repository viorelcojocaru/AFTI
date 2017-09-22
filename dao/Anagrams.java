package test;

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
