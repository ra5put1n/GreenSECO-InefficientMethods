class CachedPreferencesFile(object):

    def __del__(self):
        for key, value in self.preferences.items():
            self.write_pair(key, value)
        self.backing.close()
