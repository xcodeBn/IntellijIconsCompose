package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmaccesson: ImageVector
    get() {
        if (_Cwmaccesson != null) return _Cwmaccesson!!

        _Cwmaccesson = ImageVector.Builder(
            name = "Cwmaccesson",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(10f, 5f)
                lineTo(10f, 5f)
                close()
                moveTo(10f, 14f)
                close()
            }
        }.build()

        return _Cwmaccesson!!
    }

private var _Cwmaccesson: ImageVector? = null

