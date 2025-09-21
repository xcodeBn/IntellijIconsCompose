package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Redo: ImageVector
    get() {
        if (_Redo != null) return _Redo!!

        _Redo = ImageVector.Builder(
            name = "Redo",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 5f)
                curveTo(6.58f, 4.67f, 4.98f, 5.33f, 3.75f, 6.40f)
                lineTo(1f, 4f)
                lineTo(1f, 10f)
                lineTo(7f, 10f)
                lineTo(5f, 8f)
                curveTo(5.86f, 6.81f, 7.04f, 6.33f, 8.35f, 6.33f)
                curveTo(10.71f, 6.33f, 12.72f, 7.87f, 13.42f, 10.00f)
                lineTo(15f, 9f)
                curveTo(14.07f, 6.69f, 11.45f, 4.67f, 8.35f, 4.67f)
                close()
            }
        }.build()

        return _Redo!!
    }

private var _Redo: ImageVector? = null

