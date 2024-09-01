# Service

- Zde řešíme logiku aplikace
- Pomocí [Repository](../entity/repository/README.md) zde získáváme nebo ukládáme [Entity](../entity/README.md)
- Při vytváření záznamů získáváme [DTO](../dto/README.md) z [Controlleru](../controller/README.md), které nám [Mapper](../mapper/README.md) předělá na Entity
- Při čtení dat vracíme zkopírovaná data v DTO, které nám opět pomohl mapper předělat
