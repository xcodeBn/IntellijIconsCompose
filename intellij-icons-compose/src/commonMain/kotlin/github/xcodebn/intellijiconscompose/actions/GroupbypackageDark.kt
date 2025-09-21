package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GroupbypackageDark: ImageVector
    get() {
        if (_GroupbypackageDark != null) return _GroupbypackageDark!!

        _GroupbypackageDark = ImageVector.Builder(
            name = "GroupbypackageDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 4f)
                lineTo(7f, 4f)
                lineTo(8f, 6f)
                lineTo(3f, 6f)
                close()
            }
        }.build()

        return _GroupbypackageDark!!
    }

private var _GroupbypackageDark: ImageVector? = null

