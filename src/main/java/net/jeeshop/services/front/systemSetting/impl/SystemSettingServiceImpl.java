package net.jeeshop.services.front.systemSetting.impl;import net.jeeshop.core.ServersManager;import net.jeeshop.services.front.systemSetting.SystemSettingService;import net.jeeshop.services.front.systemSetting.bean.SystemSetting;import net.jeeshop.services.front.systemSetting.dao.SystemSettingDao;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import javax.annotation.Resource;@Servicepublic class SystemSettingServiceImpl extends ServersManager<SystemSetting, SystemSettingDao>		implements SystemSettingService {    @Resource(name="systemSettingDaoFront")    @Override    public void setDao(SystemSettingDao systemSettingDao) {        this.dao = systemSettingDao;    }}