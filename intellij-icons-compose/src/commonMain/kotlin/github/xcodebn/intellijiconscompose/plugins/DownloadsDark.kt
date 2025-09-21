package github.xcodebn.intellijiconscompose.plugins

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DownloadsDark: ImageVector
    get() {
        if (_DownloadsDark != null) return _DownloadsDark!!

        _DownloadsDark = ImageVector.Builder(
            name = "DownloadsDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {

        }.build()

        return _DownloadsDark!!
    }

private var _DownloadsDark: ImageVector? = null

