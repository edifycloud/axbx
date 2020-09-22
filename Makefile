build:axbx-admin-ums axbx-gateway axbx-portal-ui

.PHONY:axbx-admin-ums
axbx-admin-ums:
	cd axbx-admin-ums && ./mvnw clean package && docker build . -t hirosyu/axbx-admin-ums

.PHONY:axbx-gateway
axbx-gateway:
	cd axbx-gateway && ./mvnw clean package && docker build . -t hirosyu/axbx-gateway

.PHONY:axbx-portal-ui
axbx-portal-ui:
	cd axbx-portal-ui && docker build . -t hirosyu/axbx-portal-ui

deploy:
	docker push hirosyu/axbx-gateway & docker push hirosyu/axbx-portal-ui & docker push hirosyu/axbx-admin-ums
	kubectl apply -f k8s/gateway.yaml
