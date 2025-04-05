
public class P5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 1000000000; i++) {
			if (i % 19 == 0) {
				if (i % 17 == 0) {
					if (i % 16 == 0) {
						if (i % 13 == 0) {
							if (i % 11 == 0) {
								if (i % 9 == 0) {
									if (i % 7 == 0) {
										if (i % 5 == 0) {
											if (i % 4 == 0) {
												if (i % 3 == 0) {
													if (i % 2 == 0) {
														System.out.print(i);
														break;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
