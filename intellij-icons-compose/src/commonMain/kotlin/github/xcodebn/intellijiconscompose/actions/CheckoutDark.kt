package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CheckoutDark: ImageVector
    get() {
        if (_CheckoutDark != null) return _CheckoutDark!!

        _CheckoutDark = ImageVector.Builder(
            name = "CheckoutDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF3592C4))
            ) {
                moveTo(3f, 6f)
                lineTo(10f, 13f)
                lineTo(3f, 13f)
                close()
            }
        }.build()

        return _CheckoutDark!!
    }

private var _CheckoutDark: ImageVector? = null

