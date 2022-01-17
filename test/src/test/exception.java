package test;

public class exception {


		String str = "a";

		void A() {

			try {

				str = str + "b";

				B();

			} catch (Exception e) {

				str = str + "c";

			}

		 }

		void B() throws Exception {

			try {

				str = str + "d";

				C();

			} catch (Exception e) {

				str = str + "e";

			} finally {

				str = str + "f";

			}

			str = str + "g";

		}

		void C() throws Exception {

			System.out.println(12/0);

		}

		void display() {

			System.out.println(str);

		}

		public static void main(String[] args) {

			exception object = new exception();

			object.A();

			object.display();

		}

	}
