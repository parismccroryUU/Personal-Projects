
# Simple Currency Converter
# Example rates only

rates = {
    "GBP": 1.0,
    "EUR": 1.15,
    "USD": 1.33
}

amount = float(input("Enter amount: "))
source = input("Convert from (GBP/EUR/USD): ").upper()
target = input("Convert to (GBP/EUR/USD): ").upper()

if source in rates and target in rates:
    # Convert to GBP first, then to the target currency
    amount_in_gbp = amount / rates[source]
    converted_amount = amount_in_gbp * rates[target]

    print(f"{amount:.2f} {source} = {converted_amount:.2f} {target}")
else:
    print("Invalid currency. Please use GBP, EUR or USD.")
