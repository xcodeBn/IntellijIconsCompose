package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Undo: ImageVector
    get() {
        if (_Undo != null) return _Undo!!

        _Undo = ImageVector.Builder(
            name = "Undo",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 5f)
                curveTo(6.23f, 4.67f, 4.63f, 5.33f, 3.40f, 6.40f)
                lineTo(1f, 4f)
                lineTo(1f, 10f)
                lineTo(7f, 10f)
                lineTo(5f, 8f)
                curveTo(5.51f, 6.81f, 6.69f, 6.33f, 8.00f, 6.33f)
                curveTo(10.36f, 6.33f, 12.37f, 7.87f, 13.07f, 10.00f)
                lineTo(15f, 9f)
                curveTo(13.72f, 6.69f, 11.10f, 4.67f, 8.00f, 4.67f)
                close()
            }
        }.build()

        return _Undo!!
    }

private var _Undo: ImageVector? = null

