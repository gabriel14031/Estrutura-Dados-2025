# Global variable declaration
global_data = None

def enter_data():
    global global_data
    global_data = input("Enter some data: ")

if __name__ == "__main__":
    # Example usage
    enter_data()
    print(f"The entered data is: {global_data}")

