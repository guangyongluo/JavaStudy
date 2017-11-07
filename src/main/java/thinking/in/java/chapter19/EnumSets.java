package thinking.in.java.chapter19;

import static net.mindview.util.Print.print;

//: enumerated/EnumSets.java
// Operations on EnumSets
import java.util.EnumSet;

public class EnumSets {
	public static void main(String[] args) {
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class); // Empty
																			// set
		points.add(AlarmPoints.BATHROOM);
		print(points);
		points.addAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
		print(points);
		points = EnumSet.allOf(AlarmPoints.class);
		points.removeAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
		print(points);
		points.removeAll(EnumSet.range(AlarmPoints.OFFICE1, AlarmPoints.OFFICE4));
		print(points);
		points = EnumSet.complementOf(points);
		print(points);
	}
} /*
	 * Output: [BATHROOM] [STAIR1, STAIR2, BATHROOM, KITCHEN] [LOBBY, OFFICE1,
	 * OFFICE2, OFFICE3, OFFICE4, BATHROOM, UTILITY] [LOBBY, BATHROOM, UTILITY]
	 * [STAIR1, STAIR2, OFFICE1, OFFICE2, OFFICE3, OFFICE4, KITCHEN]
	 */// :~
