package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Upload: ImageVector
    get() {
        if (_Upload != null) return _Upload!!

        _Upload = ImageVector.Builder(
            name = "Upload",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 10f)
                lineTo(12f, 10f)
                lineTo(8f, 14f)
                lineTo(4f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 5f)
                lineTo(9f, 5f)
                close()
            }
        }.build()

        return _Upload!!
    }

private var _Upload: ImageVector? = null

