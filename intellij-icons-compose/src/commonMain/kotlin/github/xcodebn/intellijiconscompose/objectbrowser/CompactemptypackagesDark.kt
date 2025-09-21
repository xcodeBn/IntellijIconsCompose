package github.xcodebn.intellijiconscompose.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CompactemptypackagesDark: ImageVector
    get() {
        if (_CompactemptypackagesDark != null) return _CompactemptypackagesDark!!

        _CompactemptypackagesDark = ImageVector.Builder(
            name = "CompactemptypackagesDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(4f, 1f)
                lineTo(0f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8f)
                lineTo(8f, 12f)
                lineTo(0f, 12f)
                close()
            }
        }.build()

        return _CompactemptypackagesDark!!
    }

private var _CompactemptypackagesDark: ImageVector? = null

