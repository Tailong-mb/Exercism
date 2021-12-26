def create_inventory(items):
    """
    :param items: list - list of items to create an inventory from.
    :return:  dict - the inventory dictionary.
    """
    
    result = {item: items.count(item) for item in items}
    return result

def add_items(inventory, items):
    """
    :param inventory: dict - dictionary of existing inventory.
    :param items: list - list of items to update the inventory with.
    :return:  dict - the inventory dictionary update with the new items.
    """
    result = inventory.copy()
    for item in items:
        if item not in result.keys():
            result[item] = 1
        else:
            result[item] += 1
    return result
    
def decrement_items(inventory, items):
    """
    :param inventory: dict - inventory dictionary.
    :param items: list - list of items to decrement from the inventory.
    :return:  dict - updated inventory dictionary with items decremented.
    """
    result = inventory.copy()
    
    for item in items:
        if result[item] == 0:
            continue
        else:
            result[item] -= 1
        
    return result


def remove_item(inventory, item):
    """
    :param inventory: dict - inventory dictionary.
    :param item: str - item to remove from the inventory.
    :return:  dict - updated inventory dictionary with item removed.
    """
    result = inventory.copy()

    if item in result:
        del result[item]

    return result


def list_inventory(inventory):
    """
    :param inventory: dict - an inventory dictionary.
    :return: list of tuples - list of key, value pairs from the inventory dictionary.
    """

    result = inventory.copy()

    return [x for x in result.items() if x[1] > 0]
