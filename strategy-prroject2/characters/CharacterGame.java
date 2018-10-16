package characters;

import weapons.AxeBehavior;
import weapons.BowAndArrowBehavior;
import weapons.KnifeBehavior;
import weapons.SwordBehavior;
import weapons.WeaponBehavior;

public enum CharacterGame implements WeaponBehavior {

	KING {

		SwordBehavior sb;

		@Override
		public String useWeapon() {
			return sb.useWeapon();
		}

	},

	KNIGHT {

		KnifeBehavior kb;

		@Override
		public String useWeapon() {
			return kb.useWeapon();
		}

	},

	QUEEN {

		BowAndArrowBehavior bab;

		@Override
		public String useWeapon() {
			return bab.useWeapon();
		}

	},

	TROLL {

		AxeBehavior ab;

		@Override
		public String useWeapon() {
			return ab.useWeapon();
		}

	}
}
