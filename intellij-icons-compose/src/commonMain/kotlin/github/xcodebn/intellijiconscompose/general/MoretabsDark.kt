package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MoretabsDark: ImageVector
    get() {
        if (_MoretabsDark != null) return _MoretabsDark!!

        _MoretabsDark = ImageVector.Builder(
            name = "MoretabsDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(4f, 7f)
                lineTo(6f, 10f)
                lineTo(1f, 10f)
                close()
            }
        }.build()

        return _MoretabsDark!!
    }

private var _MoretabsDark: ImageVector? = null

