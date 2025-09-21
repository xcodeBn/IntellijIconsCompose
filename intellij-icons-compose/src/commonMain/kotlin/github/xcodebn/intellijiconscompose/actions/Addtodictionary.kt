package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Addtodictionary: ImageVector
    get() {
        if (_Addtodictionary != null) return _Addtodictionary!!

        _Addtodictionary = ImageVector.Builder(
            name = "Addtodictionary",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                lineTo(8f, 11f)
                lineTo(4f, 14f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _Addtodictionary!!
    }

private var _Addtodictionary: ImageVector? = null

