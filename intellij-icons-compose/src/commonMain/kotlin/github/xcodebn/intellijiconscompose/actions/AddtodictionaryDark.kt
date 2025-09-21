package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddtodictionaryDark: ImageVector
    get() {
        if (_AddtodictionaryDark != null) return _AddtodictionaryDark!!

        _AddtodictionaryDark = ImageVector.Builder(
            name = "AddtodictionaryDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
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

        return _AddtodictionaryDark!!
    }

private var _AddtodictionaryDark: ImageVector? = null

