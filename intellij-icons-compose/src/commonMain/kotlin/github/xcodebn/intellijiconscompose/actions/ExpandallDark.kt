package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExpandallDark: ImageVector
    get() {
        if (_ExpandallDark != null) return _ExpandallDark!!

        _ExpandallDark = ImageVector.Builder(
            name = "ExpandallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 9f)
                lineTo(12f, 12f)
                lineTo(4f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 4f)
                lineTo(12f, 7f)
                lineTo(4f, 7f)
                close()
            }
        }.build()

        return _ExpandallDark!!
    }

private var _ExpandallDark: ImageVector? = null

