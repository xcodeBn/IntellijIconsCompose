package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LinkDark: ImageVector
    get() {
        if (_LinkDark != null) return _LinkDark!!

        _LinkDark = ImageVector.Builder(
            name = "LinkDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 4f)
                lineTo(5f, 6f)
                lineTo(3f, 7f)
                lineTo(4f, 8f)
                lineTo(6f, 6f)
                lineTo(4f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(7f, 4f)
                lineTo(9f, 6f)
                lineTo(7f, 7f)
                lineTo(8f, 8f)
                lineTo(10f, 6f)
                lineTo(8f, 3f)
                close()
            }
        }.build()

        return _LinkDark!!
    }

private var _LinkDark: ImageVector? = null

