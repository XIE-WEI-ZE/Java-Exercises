CREATE TABLE [dbo].[台北市觀光] (
    [id] INT IDENTITY(1,1) PRIMARY KEY,        -- Auto-incrementing ID
    [period] NVARCHAR(50) NOT NULL,            -- Period (e.g., "87年 1月")
    [artMuseumVisits] INT NOT NULL,            -- Visits to the Art Museum
    [zooVisits] INT NOT NULL,                  -- Visits to the Zoo
    [childrenNewParkVisits] INT NOT NULL,      -- Visits to the Children's New Park
    [astronomyMuseumVisits] INT NOT NULL,      -- Visits to the Astronomy Museum
    [shilinOfficialResidenceParkVisits] INT NOT NULL, -- Visits to the Shilin Official Residence Park
    [waterParkVisits] INT NOT NULL,            -- Visits to the Water Park
    [hotSpringMuseumVisits] INT NOT NULL,      -- Visits to the Hot Spring Museum
    [discoveryCenterVisits] INT NOT NULL,      -- Visits to the Discovery Center
    [blueWaterwayVisits] INT NOT NULL          -- Visits to the Blue Waterway
);
select * from 台北市觀光


drop table 台北市觀光

