package github.xcodebn.intellijiconscompose.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SortbytypeDark: ImageVector
    get() {
        if (_SortbytypeDark != null) return _SortbytypeDark!!

        _SortbytypeDark = ImageVector.Builder(
            name = "SortbytypeDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(5f, 10f)
                lineTo(9f, 14f)
                lineTo(1f, 14f)
                close()
            }
        }.build()

        return _SortbytypeDark!!
    }

private var _SortbytypeDark: ImageVector? = null

