package com.home.device_service.service;

import com.home.device_service.dto.DeviceDto;
import com.home.device_service.entity.Device;
import com.home.device_service.repository.DeviceRepository;

public class DeviceService {

    private DeviceRepository deviceRepository;

    public DeviceService(DeviceRepository deviceRepository){
        this.deviceRepository=deviceRepository;
    }
    public DeviceDto getDeviceById(Long id) {
        Device device = deviceRepository.findById(id).orElseThrow(()-> new DeviceNotFoundException("Device not found with id " + id));
        return mapToDto(device);
    }

    private DeviceDto mapToDto(Device device) {
        return null;
    }

    public void deleteDevice(Long id) {
    }

    public DeviceDto updateDevice(Long id, DeviceDto deviceDto) {
    }

    public DeviceDto createDevice(DeviceDto deviceDto) {
    }
}
