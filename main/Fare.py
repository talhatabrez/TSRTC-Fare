class Fare:
    @staticmethod
    def get_fare(board_pt, deboard_pt):
        bus_stops = [
            "Gangaram", "Madinaguda", "St.Anns", "Allwyn X Roads", 
            "Miyapur X Roads", "Miyapur Metro", "Hydernagar", 
            "Nizampet X Roads", "JNTU College", "KPHB Colony"
        ]

        board_index = -1
        deboard_index = -1

        for i, stop in enumerate(bus_stops):
            if stop == board_pt:
                board_index = i
                break

        for i, stop in enumerate(bus_stops):
            if stop == deboard_pt:
                deboard_index = i
                break

        if board_index != -1 and deboard_index != -1 and deboard_index > board_index:
            return (deboard_index - board_index) * 5
        else:
            return -1

    @staticmethod
    def main():
        print("\nWelcome to TSRTC City Services - Hyderabad")
        print("----------------------------------------------")
        print("  || We care for your transportation  ||")
        print("----------------------------------------------")
        print("This city bus starts from Gangaram and goes till KPHB Colony.")
        print("The bus halts at following bus stops:\n")
        print("1.Gangaram; 2.Madinaguda; 3.St.Anns; 4.Allwyn X Roads; 5.Miyapur X Roads;")
        print("6.Miyapur Metro; 7.Hydernagar; 8.Nizampet X Roads; 9.JNTU College; 10. KPHB Colony")

        sex = input("\nEnter your sex: (either F or M)\n")

        if sex == "M":
            board_pt = input("\nEnter your boarding point: ")
            deboard_pt = input("\nEnter the de-boarding point: ")

            fare = Fare.get_fare(board_pt, deboard_pt)

            if fare != -1:
                print(f"\nYour ticket price from {board_pt} to {deboard_pt} is Rs.{fare}")
                payment_mode = int(input("\nEnter your payment mode:\n1. Cash\n2. Bank Transfer\n3. UPI\n"))

                if payment_mode == 1:
                    print("\nPlease pay in cash, to the respective bus conductor.")
                elif payment_mode == 2:
                    print("\nThe bank details are: \nBank Name: HDFC Bank \nAccount Number: 212231325449 \nIFSC Code: HDF04668448")
                else:
                    print("\nPlease pay on the UPI ID: sonata@googlepay.okhdfcbank")
            else:
                print("Please check your entry in boarding point and de-boarding point")
        else:
            board_pt = input("\nEnter your boarding point: ")
            deboard_pt = input("\nEnter the de-boarding point: ")

            print("\nFemales are being offered free tickets.")
            print(f"Your ticket price from {board_pt} to {deboard_pt} is Rs. 0")

        print("\nThank you for choosing TSRTC\n")


if __name__ == "__main__":
    Fare.main()
