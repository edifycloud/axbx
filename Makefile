build:axbx-admin-ums axbx-gateway

.PHONY:axbx-admin-ums
axbx-admin-ums:
	cd axbx-admin-ums && ./mvnw clean package && docker build . -t hirosyu/axbx-admin-ums

.PHONY:axbx-gateway
axbx-gateway:
	cd axbx-gateway && ./mvnw clean package && docker build . -t hirosyu/axbx-gateway
