package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Link: ImageVector
    get() {
        if (_Link != null) return _Link!!

        _Link = ImageVector.Builder(
            name = "Link",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
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
                fill = SolidColor(Color(0xFF6E6E6E))
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

        return _Link!!
    }

private var _Link: ImageVector? = null

